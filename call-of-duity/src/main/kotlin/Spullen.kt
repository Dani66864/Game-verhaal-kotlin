class Spullen(val name:String,var durability: Int) {

    fun show(){
        println("""
            name: $name
            durability: $durability
            """)
    }
}