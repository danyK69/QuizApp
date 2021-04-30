package com.codewithdan.quiznow

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this historical structure which is located in Piazza del Duomo, Italy?",
            R.drawable.q1,
            "Leaning tower of Pi",
            "Milan Cathedral",
            "Ponte Vechhio",
            "Colosseum",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "This famous statue located in New York City is referred to as:",
            R.drawable.q2,
            "Spring Temple Buddha",
            "Christ the Redeemer",
            "Lion-Man",
            "Statue of Liberty",
            4
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "The structure below located in the Middle East was built thousands of years ago, and still stands today.",
            R.drawable.q3,
            "Pharoah's Tomb",
            "Joseph’s Tomb",
            "Egyptian Pyramid",
            "Mecca Temple",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "The highest mountain in the world, standing at 8,848 meters and 29,029 feet, with 145 attempts to climb it",
            R.drawable.q4,
            "Makalu",
            "Nanga",
            "Himalayan Mountains",
            "Mt Everest",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "This is longest wall in the world and has a main-line length of 3,460 km (2,150 miles – nearly three times the length of Britain – plus 3,530 km (2,193 miles) of branches and spurs.",
            R.drawable.q5,
            "Kumbhalgar Fort",
            "Great wall of China",
            "Amer Fort Jaipur",
            "Ancient wall of Mesopotamia",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "This famed area is located in the mountains, at more than 2,400 metres/8,000 feet above sea level. This ruin site has more than 200 different buildings and structures.",
            R.drawable.q6,
            "Machu Pichu",
            "Nazca Lines",
            "Choquequira",
            "Chichen Itza",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "In 1632 the emperor, Shah Jahan instructed to build a tomb for his favorite wife, Mumtaz Mahal. They used 20,000 workers and 1000 elephants.",
            R.drawable.q7,
            "The Red Taj",
            "Mizo Taj",
            "Bibi ka Maqbara",
            "The Taj Mahal",
            4
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "The opera house was designed by Jørn Utzon from Denmark and it was built between 1959 and 1973, with over 1 million roof tiles.",
            R.drawable.q8,
            "Teatro di San Carlo",
            "Guangzhou Opera House",
            "Sydney Opera House",
            "Bunkamura Orchard Hall",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "Michelangelo created this masterpiece some time between 1508 and 1512 and it lives in the Sistene Chapel",
            R.drawable.q9,
            "Creation of Adam",
            "David",
            "Genesis",
            "Birth from Heaven",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "This famous American made car became the most popular car in the US in 1965.",
            R.drawable.q10,
            "Ford F series",
            "Ford Mustang",
            "Chevrolet Silverado",
            "Chevrolet Tahoe",
            2
        )
        questionList.add(que10)

        return questionList

    }

}