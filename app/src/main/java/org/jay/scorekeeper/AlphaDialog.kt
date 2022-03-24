package org.jay.scorekeeper

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider

class AlphaDialog : DialogFragment(), View.OnClickListener {
    companion object {
        const val TAG = "AlphaDialog"
    }

    lateinit var viewModel: AlphaDialogViewModel

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        Logger(TAG, "onCreateDialog")
        activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Title")
            val layout = it.layoutInflater.inflate(R.layout.alpha_dialog, null, false)
            builder.setView(layout)
            layout.findViewById<Button>(R.id.done).setOnClickListener(this)
            layout.findViewById<Button>(R.id.button_one).setOnClickListener(this)
            layout.findViewById<Button>(R.id.button_two).setOnClickListener(this)
            //        this.isCancelable = false
            return builder.create()
        }

        return AlertDialog.Builder(activity).create()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Logger(TAG, "onViewCreated")
        viewModel = ViewModelProvider(this).get(AlphaDialogViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Logger(TAG, "onCreateView")
        return inflater.inflate(R.layout.alpha_dialog, container, false);
    }

    override fun onClick(view: View) {
        Logger(TAG, "onClick")

        when (view.id) {
            R.id.done -> dismiss()
            R.id.button_one -> operation(10)
            R.id.button_two -> operation(20)
        }
    }

    fun operation(value: Int) {
        Logger(TAG, "Incoming operation for $value")
        viewModel.operations(value)
    }
}