package com.appinter.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.appinter.app.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    var Water = MainActivity()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // BUTTON MIN SELECTOR // GIVE A SHORT MESSAGE OF ACTIVATION
        view.findViewById<Button>(R.id.button_min_id).setOnClickListener {
            val buttonMin = Toast.makeText(context, "Minimal Watering Assigned", Toast.LENGTH_SHORT)
            Water.amountWater = 0
            buttonMin.show()
            print(Water.amountWater)
        }

        // BUTTON MID_MIN SELECTOR // GIVE A SHORT MESSAGE OF ACTIVATION
        view.findViewById<Button>(R.id.button_mid_min_id).setOnClickListener {
            val buttonMidMin = Toast.makeText(context, "Almost Never Watering Assigned", Toast.LENGTH_SHORT)
            Water.amountWater = 25
            buttonMidMin.show()
            print(Water.amountWater)
        }

        // BUTTON MID SELECTOR // GIVE A SHORT MESSAGE OF ACTIVATION
        view.findViewById<Button>(R.id.button_mid_id).setOnClickListener {
            val buttonMid = Toast.makeText(context, "Average Watering Is Assigned To Your Plant", Toast.LENGTH_SHORT)
            Water.amountWater = 50
            buttonMid.show()
            print(Water.amountWater)
        }

        // BUTTON MID_MAX SELECTOR // GIVE A SHORT MESSAGE OF ACTIVATION
        view.findViewById<Button>(R.id.button_mid_max_id).setOnClickListener {
            val buttonMidMax = Toast.makeText(context, "Drowning In Process", Toast.LENGTH_SHORT)
            Water.amountWater = 75
            buttonMidMax.show()
            print(Water.amountWater)
        }

        // BUTTON MAX SELECTOR // GIVE A SHORT MESSAGE OF ACTIVATION
        view.findViewById<Button>(R.id.button_max_id).setOnClickListener {
            val buttonMax = Toast.makeText(context, "Instant Drowned", Toast.LENGTH_SHORT)
            Water.amountWater = 100
            buttonMax.show()
        }

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}