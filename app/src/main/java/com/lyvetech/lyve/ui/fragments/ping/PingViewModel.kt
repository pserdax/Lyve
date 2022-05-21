package com.lyvetech.lyve.ui.fragments.ping

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.lyvetech.lyve.di.IoDispatcher
import com.lyvetech.lyve.models.Event
import com.lyvetech.lyve.models.User
import com.lyvetech.lyve.repositories.LyveRepository
import com.lyvetech.lyve.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

@HiltViewModel
class PingViewModel @Inject constructor(
    private val repository: LyveRepository,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : ViewModel() {

    private val coroutineContext = viewModelScope.coroutineContext + ioDispatcher

    fun getEventBelongingToCurrentUser(user: User): LiveData<Resource<List<Event>>> =
        liveData(coroutineContext) {
            emit(Resource.Loading())

            when (val result = repository.getEventBelongingToCurrentUser(user)) {
                is Resource.Success -> {
                    if (result.data != null) {
                        emit(Resource.Success(data = result.data))
                    } else {
                        emit(
                            Resource.Error(
                                data = result.data,
                                message = "No events found, it's null"
                            )
                        )
                    }
                }
                is Resource.Error -> {
                    emit(Resource.Error(message = result.message))
                }
                is Resource.Loading -> {
                    emit(Resource.Loading(data = result.data))
                }
            }
        }

    fun getCurrentUser(): LiveData<Resource<User>> =
        liveData(coroutineContext) {
            emit(Resource.Loading())

            when (val result = repository.getCurrentUser()) {
                is Resource.Success -> {
                    if (result.data != null) {
                        emit(Resource.Success(data = result.data))
                    } else {
                        emit(
                            Resource.Error(
                                data = result.data,
                                "Current user is not found, it is null"
                            )
                        )
                    }
                }
                is Resource.Error -> {
                    emit(Resource.Error(message = result.message))
                }
                is Resource.Loading -> {
                    emit(Resource.Loading(data = result.data))
                }
            }
        }
}