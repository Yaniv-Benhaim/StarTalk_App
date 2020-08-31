package com.gamedev.startalktheapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.gamedev.startalktheapp.models.User;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<ArrayList<User>> userLiveData;
    ArrayList<User> userArrayList;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("StarTalk");

        userLiveData = new MutableLiveData<>();

        // call your Rest API in init method
        init();
    }

    public MutableLiveData<ArrayList<User>> getUserMutableLiveData() {
        return userLiveData;
    }


    private void init() {

        populateList();
        userLiveData.setValue(userArrayList);
    }

    private void populateList() {
        User user = new User();
        user.setTitle("Astronomical Numbers");
        user.setDescription("Best rating movie");



        userArrayList = new ArrayList<>();
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);

    }

    public LiveData<String> getText() {
        return mText;
    }

    public MutableLiveData<ArrayList<User>> getUserLiveData() {
        return userLiveData;
    }
}