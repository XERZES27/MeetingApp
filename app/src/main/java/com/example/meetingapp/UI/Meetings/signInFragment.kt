package com.example.meetingapp.UI.Meetings

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


import com.example.meetingapp.R
import kotlinx.android.synthetic.main.sign_in_fragment.view.*


const val TEXT_KEY = "token"
const val SHARED_PREFERENCE_ID = "shared_preference_file_id"

class signInFragment : Fragment() {

    companion object {
        fun newInstance() = signInFragment()
    }



    private lateinit var viewModel: SignInViewModel
    lateinit var sharedPreferences: SharedPreferences
    lateinit var token : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        sharedPreferences = getSharedPreferences(SHARED_PREFERENCE_ID, Context.MODE_PRIVATE)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.sign_in_fragment, container, false)
        val signInButton = view.signin

        signInButton.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_allMeetingsFragment)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SignInViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun loadToken() {
        val savedText = sharedPreferences.getString(TEXT_KEY, "kdfaakjf")
        token = savedText
    }

    private fun saveToken(token: String) {
        with(sharedPreferences.edit()){
            putString(TEXT_KEY, token)
            apply()
        }
    }



}
