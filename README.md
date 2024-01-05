**Define Automate Test Before Run**
<img width="960" alt="Define Automate Test Before Run" src="https://github.com/hendar-suhendar/API-Sample-Test/assets/99055058/efccca15-648e-435c-a91e-30e813472bad">
**Running well**
<img width="960" alt="Running well" src="https://github.com/hendar-suhendar/API-Sample-Test/assets/99055058/dbda84dd-7184-4876-a18d-7eb33b63813d">
**After Running Test**
<img width="960" alt="After Running" src="https://github.com/hendar-suhendar/API-Sample-Test/assets/99055058/2674ae11-8a26-4348-b0ce-c5ef92fe498d">

Menjalankan API sample Test automate
  1. buka katalon studio versi 8 atau yang terbaru
  2. Buka folder Test Suites
  3. Menjalankan Regression test -> TS_Collection Regression Test lalu pilih run
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
