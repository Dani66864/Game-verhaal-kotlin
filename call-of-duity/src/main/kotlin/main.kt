fun main(args: Array<String>) {


    val ansi_red = "\u001b[31m"
    val ansi_green = "\u001b[32m"
    val ansi_yelllo = "\u001b[33m"
    val ansi_blue = "\u001b[34m"
    val ansi_white = "\u001b[0m"
    val blod_green = "\u001b[32;1m"
    val mageneta = "\u001b[35;1m"
    val underline = "\u001b[4m"
    val bold = "\u001b[1m"



    var player = GameSettings()

    player.gameRegels()

    player.nameinput()


    println("Typ hier uw leeftijd:")
    val age = readLine()!!.toInt()

    var underage: Int = 18

    if (age < underage) {
        print("$ansi_red"+"U bent minderjarig dus u mag het speeltje niet spelen")
    }else{
        player.kledingKiezen()
        player.startVerhaal()

        var Gameverhaal = Verhaal()

        var beslissing = Beslissing()

        var status = Player("Dani")

        Gameverhaal.verhaal()

//      hier wordt de status van de speler weergegeven
        status.huidigeStatus()
        println( "$ansi_white"+"Hallo " + "$mageneta"+status.name+ "$ansi_white Hieronder wordt je status weergeven:")
        status.show()

//      hier wordt de verhaal van level1 gezet

        Gameverhaal.level1()

//      touw status

//        var touw = Spullen("Touw",25)
//        touw.show()

//      mes damage
//        var spullenStatus = Wapen("mes",30)
//        spullenStatus.show()

//      steen damage

//        spullenStatus = Wapen("steen",20)
//        spullenStatus.show()

        var level1: String? = readLine()!!.toLowerCase()

        while (level1 != "mes" && level1 !="steen"){
            println("$ansi_red"+"Er zat iets die fout getypt zijn, probeer het nogmaals opnieuw")
            level1 = readLine()!!.toLowerCase()
        }

        if(level1 == "mes"){
            beslissing.keuze1_goed()
            println("Want het touw heeft:")
            var touw = Spullen("Touw",25)
            touw.show()
            println("Je$ansi_blue nieuwe$ansi_white status is:")
            status.goedBeslissing_level1()

//            level2
            Gameverhaal.level2()
            var level2:String? = readLine()!!.toLowerCase()
            while (level2 != "ja" && level2 !="nee"){
                println("$ansi_red"+"Er zat iets die fout getypt zijn, probeer het nogmaals opnieuw")
                level2 = readLine()!!.toLowerCase()
            }

            if(level2 == "ja"){
                beslissing.keuze2_goed()
                status.goedBeslissing_level2()
            }else if(level2 == "nee"){
                beslissing.keuze2_fout()
                status.foutBeslissing_level2()
            }


        }else if (level1 == "steen"){
            beslissing.keuze1_fout()
            println("Je hebt nu het volgende status: ")
            status.foutBeslissing_level1()

            //            level2
            Gameverhaal.level2()
            var level2:String? = readLine()!!.toLowerCase()
            while (level2 != "ja" && level2 !="nee"){
                println("$ansi_red"+"Er zat iets die fout getypt zijn, probeer het nogmaals opnieuw")
                level2 = readLine()!!.toLowerCase()
            }

            if(level2 == "ja"){
                beslissing.keuze2_goed()
                status.goedBeslissing_level2()
            }else if(level2 == "nee"){
                beslissing.keuze2_fout()
                status.foutBeslissing_level2()
            }


        }
    }

}