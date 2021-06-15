# Spring Data Redis로 구현하는 Ranking List

![Java_11](https://img.shields.io/badge/java-v11-red?logo=java&style=flat-square&logoColor=white)
![Spring_Boot](https://img.shields.io/badge/Spring_Boot-v2.5.1-6DB33F.svg?logo=spring&style=flat-square&logoColor=white)
![Spring_Data_JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F.svg?style=flat-square&logo=spring&logoColor=white)
![MariaDB](https://img.shields.io/badge/MariaDB-003545.svg?style=flat-square&logo=MariaDB&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36.svg?style=flat-square&logo=apache-maven&logoColor=white)

Redis의 Sorted Set을 사용한 Ranking API를 만들어보고 약 천만건의 player 데이터를 통해 RDB와 Sorted Set의 성능 차이가 얼마나 있는지에 대해서 알아보도록 하겠습니다.

## 순서

1. redis 서버 실행
```shell
> redis-server
```

2. 테스트 ```add()``` 실행 (데이터 적재)


3. 데이터 적재 확인
```shell
> redis-cli

> zcard player
```


4. 테스트 ```getPlayers``` 실행 (데이터 추출)