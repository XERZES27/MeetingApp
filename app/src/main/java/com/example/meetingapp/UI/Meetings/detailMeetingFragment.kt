package com.example.meetingapp.UI.Meetings

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.meetingapp.R

class detailMeetingFragment : Fragment() {

    companion object {
        fun newInstance() = detailMeetingFragment()
    }

    private lateinit var viewModel: DetailMeetingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detail_meeting_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailMeetingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
