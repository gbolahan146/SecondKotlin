package com.example.secondkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(task_recycler) {

            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = BioRecyclerAdapter(populate())
        }
        button_second.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

        private fun popul ate(): List<BioItem>{
            return listOf(
                BioItem("Full name", getString(R.string.full_name_gbolahan_oduyemi)),
                BioItem("Email address", getString(R.string.email_gbolahanoduyemi1_gmail_com)),
                BioItem("Slack username:", getString(R.string.slack_username_gbolahan146)),
                BioItem("Tracks", getString(R.string.tracks_mobile))

            )
    }
}
