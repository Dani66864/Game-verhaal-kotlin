class Wapen(val name: String, var damage: Int) {

    fun show(){
        println("""
            name: $name
            damage: $damage
            """)
    }
}