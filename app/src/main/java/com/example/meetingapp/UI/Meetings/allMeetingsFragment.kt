package com.example.meetingapp.UI.Meetings

import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.meetingapp.Items.meetingItem

import com.example.meetingapp.R
import com.example.meetingapp.ViewModels.MeetingViewModel
import com.example.meetingapp.data.Meeting

class allMeetingsFragment : Fragment() {

    //private lateinit var binding: FragmentallMeetingBinding

    companion object {
        fun newInstance() = allMeetingsFragment()
    }

    private fun connected():Boolean {
        val context = requireContext()
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        return activeNetwork != null && activeNetwork.isConnected
    }

    private lateinit var viewModel: MeetingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        DataBindingUtil.setContentView<R.layout.all_meetings_fragment>(
//            this, R.layout.activity_main
//        ).apply {
//            this.setLifecycleOwner(this@MainActivity)
//            this.viewmodel = meetingViewModel}

//        binding = DataBindingUtil.inflate(inflater, R.layout.all_meetings_fragment, container, false)
//
//        binding.setLifecycleOwner(this)
//
//        return binding.root


        return inflater.inflate(R.layout.all_meetings_fragment, container, false)





    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MeetingViewModel::class.java)


    }

//    private fun List<Meeting>.tomeetingItem() : List<meetingItem> {
//        return this.map {
//            meetingItem(it)
//        }
//    }

    fun initRecyclerView(items:List<Meeting>){





    }

}
