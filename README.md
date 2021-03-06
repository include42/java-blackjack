# java-blackjack
블랙잭 게임 미션 저장소



## 기능목록

1. 이름을 입력받는다.
2. 카드를 각 플레이어와 딜러에게 2장씩 나눠준다.
3. 플레이어마다 추가로 카드를 뽑을지 결정한다.
4. 딜러가 추가로 카드를 뽑는다.
5. 결과를 비교한다.
6. 승패를 출력한다.



## 구현목록

- 카드
  - 생성 테스트
  - 카드간 비교 구현
  - 카드의 숫자 반환 메서드 구현
  - 카드 이름 출력 구현
- 카드 팩토리
  - 카드 전달 메서드 구현
- 덱 생성 팩토리
  - 카드 리스트 생성 메서드 구현
- 덱
  - 한 장을 뽑아주는 메서드(이전 값과 중복 X)
  - 예외처리 체크(카드를 다 뽑았을 경우)
- 카드 패
  - 카드 추가 메서드 구현
  - 이름 출력 메서드 구현
  - 점수 생성 메서드 구현
  - 에이스 카드 점수 구현
  - 게임 오버 여부 반환 구현
- 게임 참가자
  - 생성
  - 이름 반환 메서드
  - 카드를 뽑는 메서드
  - 결과 문자열 전달 메서드
  - 점수 반환 메서드
- 플레이어
  - 생성자 테스트(이름 설정)
  - 이름 반환 메서드(필드변수 반환)
  - 카드를 뽑는 메서드
  - 결과 문자열 전달 메서드
  - 점수 반환 메서드
- 딜러
  - 이름 반환 메서드("딜러" 반환)
  - 시작시 보유 카드 반환하는 메서드(카드 1장만 공개)
- 인터페이스를 통한 전략 패턴 - 카드 추가로 뽑기
  - 플레이어 : 입력을 통해 결정
  - 딜러 : 16 이하일 경우에만 결정

- 게임 결과 클래스
  - 생성
  - 플레이어의 승패결과를 반환하는 메서드
  - 딜러의 승패결과를 반환하는 메서드



## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)