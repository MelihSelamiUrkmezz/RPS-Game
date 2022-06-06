# RPS(Rock-Paper-Scissors) Game

*Java Swing* ve *Mysql Db* ile geliştirilmiş bir Taş-Kağıt-Makas uygulamasıdır.


![image](https://miro.medium.com/max/1000/1*FEcr9_owB5KplrClDpRenA.png)

## Taş-Kağıt-Makas oyunu nasıl oynanır?
Taş kağıt makas oyunu 2 kişi ile oynanan bir oyundur. İki kişi senkronize bir şekilde elleriyle taş,kağıt veya makas yaparak birbirleriyle yarışır. 

Bu durumların birbirlerine göre kazanma durumlarını açıklayacak olursak;

* Taş makası kırar.
* Kağıt taşı sarar.
* Makas kağıdı keser.

Yazdığım uygulamada kullanıcı bilgisayara karşı taş kağıt makas oynar. Anlık skor oyun frame'inde gözükür. Kullanıcının eskiye yönelik skorları tutularak oyun durumunu görüntüle butonu altında kullanıcıya ait istatistikler bulunur. Ayrıca kullanıcının diğer kullanıcılar arasında kaçıncı olduğunu görüntüleyebilmesi için sırasını gösteren bir table bulunmaktadır.


## Projede bulunan sınıfların işlevleri;

* Arrangement Class = Kullanıcıların isimlerini, oynadıkları oyun sayılarını ve kazandığı oyunların sayısını tutan bir sınıftır. Bu sınıfı oluşturma sebebim kullanıcıları kazanma sayısına göre sıralayıp table'a yazdırmak içindir.
  
* DbConfClass = Veritabanı konfigrasyon parametrelerinin bulunduğu sınıftır.

* GamePage Class = Oyunun oynandığı frame'in kodlarının bulunduğu sınıftır.

* GamerClass Class = Oyuncuların bilgilerinin tutulduğu sınıftır.

* LoginPage Class = Oyuncuların oyuna giriş yaptığı frame'in kodlarının bulunduğu dosyadır.

* RegisterPage Class = Oyuncuların kayıt olabileceği ekranın frame kodlarının bulunduğu sınıftır.
  
* Status Class = Oyuncuların durumunu görüntüleyebildiği ekranın frame kodlarının bulunduğu sınıftır.
  
* Main Class = Projenin çalıştırılması gereken java sınıfıdır. Bu java sınıfı çalıştırıldığında proje çalışacaktır.

## Projeye Ait Bilgiler

- Proje *Netbeans JDK 18* ile geliştirilmiştir.
- Veritabanı için *MySql* veritabanı kullanılmıştır.
- Projenin sorunsuz bir şekilde çalıştırılabilmesi için sql kütüphanesinin import edilmesi gerekmektedir.[JDBC Link](https://docs.cloudbees.com/docs/cloudbees-build-acceleration/11.0/install-guide/install/install-jdbc-database-drivers)

## Projeye Ait Görseller

* Oyuncu Giriş Ekranı

![image](https://github.com/MelihSelamiUrkmezz/RPSGame/blob/master/ProjectImages/LoginPage.png)

* Oyuncu Kayıt Ekranı

![image](https://github.com/MelihSelamiUrkmezz/RPSGame/blob/master/ProjectImages/RegisterPage.png)

* Oyun Sayfası

![image](https://github.com/MelihSelamiUrkmezz/RPSGame/blob/master/ProjectImages/GamePage.png)

* Oyuncu Durum Sayfası

![image](https://github.com/MelihSelamiUrkmezz/RPSGame/blob/master/ProjectImages/GameState.png)

