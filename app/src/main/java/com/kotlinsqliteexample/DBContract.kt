package com.kotlinsqliteexample

import android.provider.BaseColumns

/**
 * Created by Lenovo on 12/05/2017.
 */
object DBContract {

    /* Inner class that defines the table contents */
    class UserEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "users"
            val COLUMN_USER_ID = "userid"
            val COLUMN_NAME = "name"
            val COLUMN_AGE = "age"
        }
    }
}