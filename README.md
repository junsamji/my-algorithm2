# 게릴라 이벤트

### 방문 손님에게 기프티콘을 주는 이벤트를 진행하려고 한다.
### 최대한 많은 손님에게 선물을 주고 싶지만 날마다 기프티콘 수량은 변화하며 한정되어 있다.

### 기프티콘의 수량이 담긴 배열 event가 매개변수로 주어지고, 
### K일간 연속적으로만 이벤트 행사를 진행할 수 있을때,

### 가장 많은 손님에게 기프티콘을 나눠줄 수 있는 최대합계를 구하는 solution 함수를 완성하자.

- 제한사항
  - event배열의 길이는 1이상 100,000 이하이다.
  - event의 원소는 1,000이하인 자연수이다.
  - K는 1이상 1,000이하이고, event의 길이보다 작거나 같다.
  
- 입출력
  |**K**|**event**|**result**|
  |:--:|:--:|:--:|
  |3|[5,1,9,8,10,5]|27|
  |6|[10,1,10,1,1,4,3,10]|29|

- 예시
  - 기프티콘 이벤트를 3일간 연속적으로 진행 가능.
  - 3일 동안 기프티콘을 가장 많이 보유하고 있는 날짜를 찾아보자.
  - 9,8,10개의 기프티콘을 보유하고 있는 날짜에 이벤트를 진행하면 총 27명에게 기프티콘을 나눠줄 수 있다.

