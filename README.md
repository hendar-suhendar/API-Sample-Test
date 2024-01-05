# API-Sample-Test

Menjalankan API sample Test automate
  1. buka katalon studio versi 8 atau yang terbaru
  2. Buka folder Test Suites
  3  Menjalankan Regression test -> TS_Collection Regression Test lalu pilih run
  4. Menjalankan smoke test atau sannity test -> Jalankan dengan Test Per Scenario, pilih functional case yang ingin diuji lalu pilih run

> melalui katalon TestOps / CICD (licence)
Lakukan konfigurasi dan integrasikan pada katalon studio repository, instal KRE pada server dan jalankan melalui katalon testops

#Note :
Perlu dilakukan improvement query ke db untuk mevalidasi data

deffect issue API sample Test :
1. Response kurang sesuai pada input gender dan status
comment : saat input dengan salah memasukkan gender male/female dan status active/inactive memberikan response blank input

2. Delete user belum terdapat penjagaan api token
comment : saat input dengan tanpa memasukkan token masi tetap bisa menghapus data user

3. Delete user belum terdapat penjagaan api token
comment : saat melakukan penghapusan user belum terdapat keterangan response body berhasil/gagal