package com.lyvetech.lyve.utils

object Constants {

    /**
     * USER DATA
     */
    const val NAME = "name"
    const val EMAIL = "email"
    const val UID = "uid"
    const val AVATAR = "avatar"
    const val PASS = "pass"
    const val CREATED_AT = "createdAt"
    const val BIO = "bio"
    const val IS_VERIFIED = "isVerified"
    const val FOLLOWERS = "followers"
    const val FOLLOWINGS = "followings"
    const val ATTENDINGS = "attendings"

    /**
     * ACTIVITY DATA
     */
    const val EVENT_ID = "uid"
    const val EVENT_TITLE = "title"
    const val EVENT_DESC = "desc"
    const val EVENT_TYPE = "isOnline"
    const val EVENT_IMG_REFS = "imgRefs"
    const val EVENT_CREATED_AT = "createdAt"
    const val EVENT_DATE = "date"
    const val EVENT_TIME = "time"
    const val EVENT_LOCATION = "location"
    const val EVENT_URL = "url"
    const val EVENT_CREATED_BY_ID = "createdByID"
    const val EVENT_PARTICIPANTS = "participants"

    /**
     * FIREBASE DATA
     */
    const val COLLECTION_USER = "Users"
    const val COLLECTION_ACTIVITIES = "Activities"

    /**
     * DI CONSTANTS
     */
    const val SHARED_PREFERENCES_NAME = "sharedPref"
    const val KEY_EMAIL = "KEY_EMAIL"
    const val KEY_PASSWORD = "KEY_PASSWORD"
    const val KEY_UID = "uid"

    /**
     * BUNDLE CONSTANTS
     */
    const val BUNDLE_KEY = "bundleKey"
    const val BUNDLE_FOLLOWING = "bundleFollowing"
    const val BUNDLE_FOLLOWER = "bundleFollower"

    /**
     * INTENTS
     */
    const val INTENT_GOOGLE_MAPS = "com.google.android.apps.maps"
}