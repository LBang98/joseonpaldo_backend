# 조선팔도(Joseonpaldo)
개발일정: 7/19/2024 ~ 9/18/2024

~~[https://joseonpaldo.site (폐쇠중)](https://joseonpaldo.site)~~


조선의 팔도를 테마로 한 전략 보드게임입니다. 모노폴리와 윷놀이를 결합한 독창적인 방식으로, 팔도의 다양한 지역을 탐험하며 경쟁합니다. 황금열쇠와 같은 미니게임들이 일부 칸들에 포진해있어 게임 진행이 더욱 대채로워지며, 매번 새로운 도전을 제공합니다.

## Team
| Name | Role | Github |
| :--- | :---: | :--- |
| 정민석 | Main Game, Frontend |  |
| 배동우 | Login, Backend |  |
| 이병현 | Lobby, Chat, Frontend |  |
| 이현성 | Deployment, Backend | https://github.com/themerous |
| 정환용 | Login, Backend |  |
| 최시현 | Minigame(Solo) |  |
| 허승필 | Minigame(Multi) |  |

## Tech Stack
### Frontend
![React](https://img.shields.io/badge/-React-61DAFB?style=flat-square&logo=react&logoColor=black)
![Next.js](https://img.shields.io/badge/-Next.js-000000?style=flat-square&logo=nextdotjs&logoColor=white)
![TypeScript](https://img.shields.io/badge/-TypeScript-007ACC?style=flat-square&logo=typescript&logoColor=white)
![Axios](https://img.shields.io/badge/-Axios-5A29E4?style=flat-square&logo=axios&logoColor=white)
![Socket.IO](https://img.shields.io/badge/-Socket.IO-010101?style=flat-square&logo=socket.io&logoColor=white)
![StompJS](https://img.shields.io/badge/-StompJS-7E57C2?style=flat-square)
![Material UI](https://img.shields.io/badge/-Material--UI-0081CB?style=flat-square&logo=material-ui&logoColor=white)
![pnpm](https://img.shields.io/badge/-pnpm-F69220?style=flat-square&logo=pnpm&logoColor=white)
### Backend
![Node.js](https://img.shields.io/badge/-Node.js-339933?style=flat-square&logo=nodedotjs&logoColor=white)
![Express](https://img.shields.io/badge/-Express-000000?style=flat-square&logo=express&logoColor=white)
![Spring Boot](https://img.shields.io/badge/-Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/-Spring%20Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white)
![OAuth2](https://img.shields.io/badge/-OAuth2-EB5424?style=flat-square&logo=oauth&logoColor=white)
![OpenID Connect](https://img.shields.io/badge/-OpenID%20Connect-F70000?style=flat-square&logo=openidconnect&logoColor=white)
![JWT](https://img.shields.io/badge/-JWT-000000?style=flat-square&logo=JSON-web-tokens&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/-Spring%20Data%20JPA-007396?style=flat-square)
![Gradle](https://img.shields.io/badge/-Gradle-02303A?style=flat-square&logo=gradle&logoColor=white)
![WebSocket](https://img.shields.io/badge/-WebSocket-000000?style=flat-square)
![Socket.IO](https://img.shields.io/badge/-Socket.IO-010101?style=flat-square&logo=socket.io&logoColor=white)
![StompJS](https://img.shields.io/badge/-StompJS-7E57C2?style=flat-square)
![GSON](https://img.shields.io/badge/-GSON-000000?style=flat-square)
![EasyJSON](https://img.shields.io/badge/-EasyJSON-FF9900?style=flat-square)
![Swagger](https://img.shields.io/badge/-Swagger-85EA2D?style=flat-square&logo=swagger&logoColor=white)
### DevOps
![Docker](https://img.shields.io/badge/-Docker-2496ED?style=flat-square&logo=docker&logoColor=white)
![Naver Cloud](https://img.shields.io/badge/-Naver%20Cloud-03C75A?style=flat-square&logo=naver&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/-GitHub%20Actions-2088FF?style=flat-square&logo=githubactions&logoColor=white)
![DNS](https://img.shields.io/badge/-DNS-334455?style=flat-square)
![SSL](https://img.shields.io/badge/-SSL-0033CC?style=flat-square&logo=letsencrypt&logoColor=white)
### Databases
![MySQL](https://img.shields.io/badge/-MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)
### Tools
![Visual Studio Code](https://img.shields.io/badge/-VSCode-007ACC?style=flat-square&logo=visual-studio-code&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/-IntelliJ%20IDEA-000000?style=flat-square&logo=intellij-idea&logoColor=white)
![DataGrip](https://img.shields.io/badge/-DataGrip-000000?style=flat-square&logo=datagrip&logoColor=white)
![Trello](https://img.shields.io/badge/-Trello-0052CC?style=flat-square&logo=trello&logoColor=white)
![Notion](https://img.shields.io/badge/-Notion-000000?style=flat-square&logo=notion&logoColor=white)
![Google Docs](https://img.shields.io/badge/-Google%20Docs-4285F4?style=flat-square&logo=google-docs&logoColor=white)

## 목차
- [소개영상](#소개영상)
- [ERD](#erd)
- [Schedule](#schedule)
- [Deployment](#deployment)
- [Main Application](#main-application)
- [API 명세서](#api-명세서)

## 소개영상
[![YouTube Video](https://img.youtube.com/vi/jxF3JOLMpdw/0.jpg)](https://youtu.be/jxF3JOLMpdw)

## ERD
작업중

## Schedule
작업중

## Deployment
### Servers
이미지가 들어갈 공간(1)

- DNS/SSL
  - 가비아 네이밍 서버를 통한 DNS 구축
  - 네이버 Certificate Manager를 통하여 SSL 인증서 발급
- Load Balancer
  - 네이버 클라우드의 Application Loadbalancer를 사용
  - Path분기를 통하여 서비스별로 분기점 설정
    - /api  : CRUD및 로그인/로그아웃 로직을 실행
    - /ws   : 채팅 및 메인게임의 웹소켓 통신을 담당
    - /nws  : 미니게임들이 구현된 서버
    - /     : 클라이언트 페이지
- Servers
    - 총 두개의 서버를 사용하여 각 서버에서 복수의 Docker Container활용

### CI/CD
이미지가 들어갈 공간(2)
- Github Action를 활용한 CI/CD 프로세스 구축
  - CI : Main branch로 push또는 pull request처리가 이루어지면 repository의 내역을 토대로 build를 실행. 빌드 성공시 Dockerfile을 토대로 Docker Image를 제작하여 네이버 클라우드의 Container Reqistry로 이미지를 전송
  - CD : 네이버 클라우드 CLI를 통하여 현 깃허브 액션 실행서버에서 배포 서버로의 접근 권한 부여 후 ssh 접속을 통한 원격 접속. 이후 네이버 클라우드 Container Registry에서 신규 이미지를 pull한 후 현재 사용중인 컨테이너를 정지하고 새로 pull한 이미지를 바탕으로 새 컨테이너 실행. 작업 완료 후 불필요한 이미지 버젼 제거 및 서버 접근권한 제거
- 총 4개의 Repository를 이용하여 각 Repository별로 각개의 서비스를 구축
  - JoseonpaldoFront  : NextJS 14 기반의 프론트엔드 서버
  - JoseonpaldoBack   : 로그인 인증 및 CRUD들이 이루어지는 SpringBoot 기반의 백엔드 서버
  - maingmaews        : 메인 게임의 웹소켓 통신 및 채팅기능을 처리하는 Springboot 기반의 백엔드 서버
  - minigamews        : 미니게임들의 웹소켓 통신 및 SSE를 처리하는 ExpressJS 기반의 백엔드 서버

## Main Application
### 로그인
이미지 들어갈 공간(3)
이미지 들어갈 공간(3)
- 별도의 회원가입 없이 쇼셜 로그인 옵션만 제공
  - 이미 많은 사용자들이 소셜 미디어 계정을 가지고 있어 별도의 회원 가입 절차 없이 간편하게 로그인 가능
  - 불필요한 가입 절차를 생략하고 빠르게 서비스를 이용 가능
  - 복잡한 보안 관리는 아웃 소싱, 사이트 운영자는 자체적인 보안 관리의 부담을 줄임
 
이미지 들어갈 공간(3)
- 로그인 프로세스
  - JWT
    - 발급한 토큰을 확인하는 프로세스 “JWT Auth Filter”를 추가적으로 제작
    - access토큰이 위변조, 또는 만료되었는지 확인하는 역할을 수행
    - access Token이 변조되지 않고 만료만 되었을 경우 refresh 토큰으로 accessToken을 요청한 정보와 함께 재발급
    - accessToken과 refreshToken이 함게 만료된 경우 로그아웃 상태를 나타냄
  - CSRF
    - STATELESS한 로그인 방식을 채택하여 Spring Security의 디폴트 필터를 사용 중지
- 로그아웃 프로세스
  1. 토큰들의 만료 또는 로그아웃 버튼을 클릭시 로컬스토리지에 저장된 토큰을 삭제
  2. 토큰 삭제와 동시에 백엔드 서버로 로그아웃 요청 전달
  3. 요청을 보낸 사용자의 소셜 프로바이더가 전달한 accessToken의 만료 요청
  4. DB에서 해당 사용자의 소셜 프로바이더가 제공한 accessToken의 정보 삭제

### Home
이미지 들어갈 공간(4)
- GameRoom
  - 현재 존재하는 모든 게임방 표시
  - 진행여부에 따라 조사 가능
  - 방장의 이름 또는 방의 제목을 통한 검색기능 제공
이미지 들어갈 공간(4)
- Mypage
  - 현재 나의 승률 확인 가능
  - 내가 사용중인 닉네임 변경기능 제공
- Ranking
  - 승률 기반의 랭킹 페이지 제공
  - 같은 승률일시 판수가 더 많은 사람이 더욱 높은 랭킹 소유
  - 2인/4인 랭킹을 따로 표시

### Lobby
이미지 들어갈 공간(5)
- STOMP 프로토콜을 활용하여 WebSocket 기반의 양방향 통신을 구현
- 비동기 이벤트 처리와 Pub/Sub 패턴을 적용하여 여러 클라이언트의 요청을 안정적으로 처리
- 경주게임
  - 게임의 순번을 정하기 위한 이벤트성 게임
  - 서버는 매번 플레이어에게 랜덤 속도 값을 생성하고 이를 클라이언트에 전송
  - 클라이언트는 이 속도 값을 받아 자신의 캐릭터가 경주 트랙에서 해당 속도에 맞춰 이동하도록 렌더링
- 맵 선택
  - 정해진 백그라운드 이미지를 선택하여 Main Game에서 반영되도록 전달
 
### Chatting
이미지 들어갈 공간(Chatting)
- WebSocket 기반의 채팅 서버를 구축
- Spring WebSocket과 STOMP를 연동하여 메시지 전송 지연을 최소화
- 플레이어가 실시간으로 친구를 게임에 초대하고 상호작용할 수 있도록 비동기 메시징 및 이벤트 기반 통신을 도입
- 사용자 간의 실시간 데이터 동기화와 즉각적인 친구 초대가 가능하도록 개발

### Main Game

### Mini Game
다양한 멀티플레이어 미니게임을 제공하는 웹 게임입니다. 게임은 서버와 실시간으로 통신하며, 여러 명의 플레이어가 동시에 즐길 수 있도록 구현되었습니다.
- 주요 기능
  - 실시간 멀티플레이어: Socket.io를 사용해 실시간으로 플레이어 간 상호작용을 지원합니다.
  - 중앙화된 게임 로직: 게임 로직은 서버에서 처리되어 클라이언트 간 동기화를 유지하고 공정한 게임 환경을 제공합니다.
  - 다양한 미니게임: 각기 다른 규칙과 목표를 가진 네 개의 미니게임을 제공합니다.


- Singleplay

  이미지/비디오(Shooter)
  - Alien Shooter : 우주선을 좌우로 이동시키며 외계인과 특별한 적들을 처치
    - 게임 방법
      - 좌우 버튼을 통하여 이동
      - 스페이스 버튼을 활용하여 사격 및 재장전(탄환 10발)
    - 규칙
      - 제한 시간 30초
      - 적이 나를 지날떄까지 격추 실패시 패배
    - 게임 로직
      - Alien 생성: 매초마다 새로운 외계인이 생성되며 최대 15개의 외계인이 동시에 등장합니다.
      - 충돌 감지: 탄환과 외계인 또는 특별한 적이 충돌할 때 처리되며, 적중된 외계인은 제거됩니다

    이미지/비디오(RPS)
    - 가위바위보 : 가위, 바위, 보 중 하나를 선택하여 컴퓨터와 3라운드 대결
      - 게임 방법
        - 가위, 바위, 보 중 한가지를 선택
      - 규칙
        - 각 라운드별 선택시간 3초
        - 무승부시 해당 라운드 재시작
      - 게임 로직
        - 타이머: 각 라운드는 3초 내에 선택하지 않으면 자동으로 패배 처리됩니다.
        - 점수 계산: 플레이어와 컴퓨터의 승패를 기록하여 게임이 종료되면 승자가 결정됩니다.
          
    이미지/비디오(Bomb)
    - 폭탄 해체
      - 게임 방법
        - 플레이어는 두 가지 와이어(빨강, 파랑) 중 하나를 선택하여 폭탄을 해체
      - 게임 로직
        - 해체 성공/실패: 올바른 와이어를 선택하면 폭탄이 해체되고, 잘못된 와이어를 선택하면 게임이 종료됩니다
          
    이미지/비디오(platformer)
    - 플랫폼 게임 : 장애물과 로켓을 피하면서 제한된 시간 내에 목표에 도달
      - 게임 방법
        - 화살표 키를 이용하여 좌우 이동
        - 스페이스를 통하여 점프
        - g키를 통한 사다리와의 상호작용
      - 게임 로직
        - 중력 및 점프: 플레이어의 중력과 점프 로직이 구현되어 있으며, 플랫폼에 도착하면 점프 상태가 해제됩니다
        - 로켓 생성 및 이동: 5초마다 새로운 로켓이 생성되며, 로켓은 플레이어를 공격하기 위해 날아옵니다

- Multiplay
  
  이미지/비디오(무궁화)
  - 무궁화 꽃이 피었습니다 : 4인용 서바이벌 게임으로, 술래가 돌아보는 타이밍을 피해 결승선에 먼저 도착하는 플레이어가 승리
    - 게임 방법
      - 스페이스바를 눌러 앞으로 전진합니다.
      - 술래가 "무궁화 꽃이 피었습니다"를 외칠 때만 움직입니다.
      - 술래가 돌아볼 때 움직이면 탈락합니다.
    - 규칙
      - 제한 시간은 1분입니다.
      - 가장 먼저 결승선에 도착한 플레이어만 승리합니다.
      - 시간 내에 도달하지 못하면 전원 탈락합니다.
      - 술래의 돌아보는 타이밍은 랜덤입니다.
        
  이미지/비디오(스네이크)
  - 스네이크 게임 : 뱀을 조종하여 가장 오래 살아남거나 높은 점수를 얻는 플레이어가 승리하는 4인용 서바이벌 게임
    - 게임 방법
      - 방향키 (w,a,s,d) 를 사용하여 뱀의 방향을 조종합니다.
      - 일반 사과와 황금 사과를 먹어 점수를 획득하고 꼬리를 늘립니다.
      - 다른 뱀, 자신의 몸통, 벽에 부딪히지 않도록 주의합니다.
    - 규칙
      - 일반 사과: 10점 획득, 꼬리 +1 증가
      - 황금 사과: 50점 획득, 꼬리 +5 증가
      - 꼬리가 길어질수록 조작 난이도가 상승합니다.
      - 마지막까지 생존하거나 최고 점수를 획득하면 승리합니다.


## API 명세서
이미지 들어갈 공간(7)
- swagger와 spring docs를 이용하여 작성
- authorize 기능을 이용하여 spring security로 보호된 엔드포인트도 테스트 가능
