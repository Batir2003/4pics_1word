package com.example.a4pics1word

object Constants {
    @JvmName("getQuestions")
    fun getQuestions(): MutableList<QuestionsData> {
        val list = mutableListOf<QuestionsData>()
        list.add(
            QuestionsData(
                id = 0,
                images = listOf(
                    R.drawable.photo1_1,
                    R.drawable.photo1_2,
                    R.drawable.photo1_3,
                    R.drawable.photo1_4
                ),
                correctAnswers = "COLD"
            )

        )
        list.add(
            QuestionsData(
                id = 0,
                images = listOf(
                    R.drawable.photo2_1,
                    R.drawable.photo2_2,
                    R.drawable.photo2_3,
                    R.drawable.photo2_4
                ),
                correctAnswers = "COLD"

            )
        )
        list.add(
            QuestionsData(
                id = 0,
                images = listOf(
                    R.drawable.photo3_1,
                    R.drawable.photo3_2,
                    R.drawable.photo3_3,
                    R.drawable.photo3_4
                ),
                correctAnswers = "COLD"

            )
        )
        list.add(
            QuestionsData(
                id = 0,
                images = listOf(
                    R.drawable.photo4_1,
                    R.drawable.photo4_2,
                    R.drawable.photo4_3,
                    R.drawable.photo4_4
                ),
                correctAnswers = "COLD"

            )
        )
        list.add(
            QuestionsData(
                id = 0,
                images = listOf(
                    R.drawable.photo5_1,
                    R.drawable.photo5_2,
                    R.drawable.photo5_3,
                    R.drawable.photo5_4
                ),
                correctAnswers = "COLD"

            )
        )
        return list

    }

}