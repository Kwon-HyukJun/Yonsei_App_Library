# Yonsei_App_Library
## 앱 소개

연세대학교 관련 앱 정리해 한 눈에 보이게하고 실행 할 수 있도록 만든 앱입니다.

연세대학교 재학생들이라면 자주 사용하는 LearnUs, mY-Seat 2, 연세 Y-MID, 전자출결, Yammi 앱과

국제캠퍼스 기숙사에 살고 있는 학생들이 자주 사용하는 메타클럽, 배달긱 앱이 위 앱을 통해 실행 할 수 있습니다.

----------------------------------------------
## 앱에 쓰인 주요 문법

`val myIntent = packageManager.getLaunchIntentForPackage("앱 패키지 이름")`

`packageManager`: 앱 정보 가져오거나 앱 실행할 때 사용

`getLaunchIntentForPackage`: 앱 패키지 이름을 통해 Intent 반환함

`startActivity(myIntent)`: 새로운 Intent(myIntent)를 시작할 때 사용

앱 패키지 이름은 플레이 스토어를 통해 알 수 있다.

---------------------------------------------
## 추가할 기능

- [ ] 레이아웃 조정

- [ ] 앱 패키지와 앱 이름을 넣으면 사용자가 임이의 앱을 추가할 수 있는 기능

- [ ] val btn_변수명 = findViedById<Button>(아이디)를 클래스로 처리 할 수 있도록 만들기



![연세마크](./app/src/main/res/drawable/yonseimark.jpg)
