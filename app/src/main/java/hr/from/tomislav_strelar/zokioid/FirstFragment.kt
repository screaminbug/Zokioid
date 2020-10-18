package hr.from.tomislav_strelar.zokioid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.util.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val bDayPicker = view.findViewById<DatePicker>(R.id.datePickerBirthDay)
            val birthday = bDayPicker.dayOfMonth
            val birthmonth = bDayPicker.month
            val birthyear = bDayPicker.year
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(birthday, birthmonth, birthyear)
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.randomButton).setOnClickListener {
            val random = Random(System.currentTimeMillis())
            val birthday = random.nextInt(31) + 1
            val birthmonth = random.nextInt(12) + 1
            val birthyear = random.nextInt(20) + 1
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(birthday, birthmonth, birthyear)
            findNavController().navigate(action)
        }


    }
}