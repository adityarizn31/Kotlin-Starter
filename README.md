# Kotlin - Starter

### DAY 2

* String <br>
Merupakan sebuah tipe data yang mirip dengan char. Bedanya dapat digunakan untuk menyimpan nilai berupa teks dan menampung beberapa karakter di dalamnya. <br>
Kita bisa mendefinisikan variabel tersebut dengan (" ") <br>
Pada dasarnya **String itu berbentuk Array** sehingga kita bisa mendapatkan karakternya misalkan dengan mudah dengan cara **Indexing** : <br>

```kotlin
fun main() {
    val text  = "Kotlin"
    val firstChar = text[0]
 
    print("First character of $text is $firstChar")
}
 
/*
  output : First character of Kotlin is K
*/
```

* Indexing <br>
Merupakan sebuah cara yang memudahkan kita mengakses elemen yang berada di dalam sebuah collection dengan memanfaatkan index atau posisi dari element tersebut. Biasanya posisi dimulai dari 0.

```kotlin
fun main() {
    val text  = "Kotlin"
    for (char in text){
        print("$char ")
    }
}
 
/*
  output : K o t l i n 
*/
```
Mengapa output nya terpisah ??? Karena terdapat spasi/space setelah variabel **$char ** 

* Escaped String <br>
Merupakan sebuah **Literal String** yang memungkinkan kita mengurangi ambiuitas nilai yang berada dalam sebuah string. <br>
Misal :
```kotlin
val statement ="Kotlin is awesome"
val statement ="Kotlin is "awesome""
val statement ="Kotlin is \"awesome\"
```
Maka akan terjadi ambiguitas nilai pada variabel statement karena kompiler tidak dapat mengetahui akhir dari baris nilai untuk variabel statement. 
Yang disebut dengan **Escaped** yaitu menambahkan <i> backslash </i> <br>
* **\t** : menambah tab ke dalam teks
* **\n** : membuat baris baru di dalam teks
* **\'** : menambah karakter single quote ke dalam teks
* **\"** : menambah karakter double qoute ke dalam teks
* **\\** : menambah karakter <i> backslash </i> ke dalam teks



