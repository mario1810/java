package com.generation.chapter6;


public class UserTableManager extends AbstractTableManager<UserData> {

    @Override
    public String getTableName() {
        return "USERTABLE";
    }
}