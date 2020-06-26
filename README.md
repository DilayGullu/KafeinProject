# KafeinProject

**Spring Boot Oda Rezervasyon**

![s1](https://user-images.githubusercontent.com/53331038/85908470-d8422f80-b81d-11ea-89d5-417c7bd1de34.PNG)


### Kayıtlı rezervasyonların Postman ile listelenmesi

**GET : http://localhost:9044/rezervation** 

![s7](https://user-images.githubusercontent.com/53331038/85908482-dd9f7a00-b81d-11ea-8e47-96ec3ecc0488.PNG)

### Başarılı rezervasyonlar sonucu API response >> “The meeting room has been reserved successfully” dönmelidir. 

**POST : http://localhost:9055/reservation/add** 

![reservationadd](https://user-images.githubusercontent.com/53331038/85908884-b21d8f00-b81f-11ea-942b-fb5c9b7137cc.PNG)

### Bir toplantı salonu dolu olan saate başka şirket rezervasyon yapınca service >> “Meeting room has been reserved. Please try for other times” 

**POST : http://localhost:9055/reservation/add** 

![reservationadd2](https://user-images.githubusercontent.com/53331038/85908885-b34ebc00-b81f-11ea-9032-18a893945298.PNG)

### Kişi kapasitesinin üstünde bir request alındığında >> “This meeting room’s capacity restricted X people” X= toplantı salonunun kişi kapasitesi 

**POST : http://localhost:9055/reservation/add** 

![capacity](https://user-images.githubusercontent.com/53331038/85908887-b3e75280-b81f-11ea-8a5c-1715fb8e93b8.PNG)


### Kayıtlı şirketlerin Postman ile listelenmesi

**GET : http://localhost:9044/company** 

![s2](https://user-images.githubusercontent.com/53331038/85908474-da0bf300-b81d-11ea-9974-198d326bc918.PNG)

### Kayıtlı odaların Postman ile listelenmesi

**GET : http://localhost:9044/room** 

![s3](https://user-images.githubusercontent.com/53331038/85908475-daa48980-b81d-11ea-81ac-4b2193b2b64e.PNG)

### Kayıtlı odaların id'ye göre Postman ile listelenmesi

**GET : http://localhost:9044/room/{id}** 

![s4](https://user-images.githubusercontent.com/53331038/85908476-dbd5b680-b81d-11ea-8cc8-bc3faa849953.PNG)

### Kayıtlı şirketlerin id'ye göre Postman ile listelenmesi

**GET : http://localhost:9044/company/{id}** 

![s5](https://user-images.githubusercontent.com/53331038/85908479-dc6e4d00-b81d-11ea-84a0-b66ffb4d73f9.PNG)

### Rezervasyonların Postman ile eklenmesi

**POST : http://localhost:9044/reservation/add** 

![s6](https://user-images.githubusercontent.com/53331038/85908481-dd06e380-b81d-11ea-86df-9d08ede1915b.PNG)


### Veritabanı, tablolar ve alan isimleri

![db](https://user-images.githubusercontent.com/53331038/85909062-9cf53000-b820-11ea-8a39-0801ccbf2472.PNG)


