package com.example.kosmos.chooseyoursign.usecase

import com.example.kosmos.R
import com.example.kosmos.chooseyoursign.Constants.AQUARIO
import com.example.kosmos.chooseyoursign.Constants.ARIES
import com.example.kosmos.chooseyoursign.Constants.CANCER
import com.example.kosmos.chooseyoursign.Constants.CAPRICORNIO
import com.example.kosmos.chooseyoursign.Constants.ESCORPIAO
import com.example.kosmos.chooseyoursign.Constants.GEMEOS
import com.example.kosmos.chooseyoursign.Constants.LEAO
import com.example.kosmos.chooseyoursign.Constants.LIBRA
import com.example.kosmos.chooseyoursign.Constants.PEIXES
import com.example.kosmos.chooseyoursign.Constants.SAGITARIO
import com.example.kosmos.chooseyoursign.Constants.TOURO
import com.example.kosmos.chooseyoursign.Constants.VIRGEM
import com.example.kosmos.chooseyoursign.model.ChooseYourSignModel

class ChooseYourSignUseCase {

    fun generateDummySigns(): List<ChooseYourSignModel> {
        val listOfSigns = mutableListOf<ChooseYourSignModel>()

        var sign = ChooseYourSignModel(
            1,
            ARIES,
            R.drawable.kosmos_aries
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            2,
            TOURO,
            R.drawable.kosmos_taurus
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            3,
            GEMEOS,
            R.drawable.kosmos_gemini
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            4,
            CANCER,
            R.drawable.kosmos_cancer
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            5,
            LEAO,
            R.drawable.kosmos_leo
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            6,
            VIRGEM,
            R.drawable.kosmos_virgo
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            7,
            LIBRA,
            R.drawable.kosmos_libra
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            8,
            ESCORPIAO,
            R.drawable.kosmos_scorpio
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            9,
            SAGITARIO,
            R.drawable.kosmos_sagittarius
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            10,
            CAPRICORNIO,
            R.drawable.kosmos_capricorn
        )
        listOfSigns.add(sign)
        sign = ChooseYourSignModel(
            11,
            AQUARIO,
            R.drawable.kosmos_aquarium
        )
        listOfSigns.add(sign)

        sign = ChooseYourSignModel(
            12,
            PEIXES,
            R.drawable.kosmos_pisces
        )
        listOfSigns.add(sign)

        return listOfSigns
    }
}