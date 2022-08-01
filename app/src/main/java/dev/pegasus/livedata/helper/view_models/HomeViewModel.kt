package dev.pegasus.livedata.helper.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val nameListMutableLiveData = MutableLiveData<List<String>>()
    val nameListLiveData: LiveData<List<String>> get() = nameListMutableLiveData

    fun fetchList() {
        val arrayList = ArrayList<String>()
        arrayList.add("Yaqoob")
        arrayList.add("Kamran")
        arrayList.add("Abdul Moiz")
        arrayList.add("Afnan")
        arrayList.add("Muzammil")
        arrayList.add("Sohaib")
        nameListMutableLiveData.value = arrayList
    }

}