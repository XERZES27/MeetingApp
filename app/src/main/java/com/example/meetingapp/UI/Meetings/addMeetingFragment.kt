package com.example.meetingapp.UI.Meetings

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.meetingapp.R
import com.example.meetingapp.ViewModels.MeetingViewModel

class addMeetingFragment : Fragment() {

    companion object {
        fun newInstance() = addMeetingFragment()
    }

    private lateinit var viewModel: MeetingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_meeting_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MeetingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
