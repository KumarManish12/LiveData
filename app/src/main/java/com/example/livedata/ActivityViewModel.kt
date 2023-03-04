package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel:ViewModel() {
    var text: MutableLiveData<String> = MutableLiveData("")
    var counter: MutableLiveData<Int> = MutableLiveData(0)


}