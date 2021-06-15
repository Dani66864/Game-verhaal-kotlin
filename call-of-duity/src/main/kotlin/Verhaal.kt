class Verhaal {

    val ansi_red = "\u001b[31m"
    val ansi_green = "\u001b[32m"
    val ansi_yelllo = "\u001b[33m"
    val ansi_blue = "\u001b[34m"
    val ansi_white = "\u001b[0m"
    val blod_green = "\u001b[32;1m"
    val mageneta = "\u001b[35;1m"
    val underline = "\u001b[4m"
    val bold = "\u001b[1m"

    fun verhaal(){
               println( "$ansi_yelllo"+"Je werd opeens wakker en vervolgens zie jezelf ineens op " +
                "een stoel vastgebonden met een touw\n" + "en daarom moet je in jouw herinnering induiken\n" +
                "zodat je kan weten wat is er gebeurt en hoe heb je in deze stoel vastgebonden.\n\n" +
                "$ansi_white-----------------------------------------------------")
    }

    fun level1(){
        println("Typ hier het woord$ansi_blue verder$ansi_white om aan level1 te beginnen:")
        var verderButton: String? = readLine()!!.toLowerCase()

        while (verderButton!= "verder"){
            println("$ansi_red"+"Deze veld is verplicht op te invullen")
            println("Typ$mageneta verder$ansi_white om de level1 te laten starten")
            verderButton = readLine()!!.toLowerCase()
        }

        println("--------------------level1---------------------\n\n")

        println("$ansi_yelllo"+"Je werd wakker en dan kijk je rond je heen vervolgens zie je een mes en een steen,\n" +
                "alleen je voeten zijn vastgebonden maar je handen niet,\n" +
                "wat voor element ga je kiezen$ansi_white mes$ansi_yelllo of$ansi_white steen?")
    }

        fun level2(){
            println("--------------------level2---------------------\n\n")
        println("$ansi_yelllo"+"Daarna hoor je een schietpartij buiten je kamer daarom zit je aan het zoeken naar een wapen om naar buiten te \n" +
                "kunnen gaan en om je zich zelf te beschermen daarom denk je om de kast te gaan \n" +
                "openen om een wapen te vinden. Zou je in de kast een wapen kunnen vinden of niet.\n" +
                "Beantwoord deze vraag met$ansi_white ja$ansi_yelllo of$ansi_white nee$ansi_yelllo?")
    }

}