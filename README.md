#  📑 기능 목록

-----
## 문제 1

### input
- pobi, crong의 길이는 2
- [왼쪽 페이지 번호(홀수), 오른쪽 페이지 번호(짝수)]
- 페이지는 1 ~ 400 사이

### output
- pobi가 이기면 1
- crong이 이기면 2
- 무승부 0
- 예외사항 -1

### 구현 기능 목록
#### 1. input 예외 확인 기능
- pobi와 crong의 길이가 2가 아닐 경우
- 왼쪽이 홀수가 아닐 경우, 오른쪽이 짝수가 아닐 경우
- 왼쪽과 오른쪽이 연속되지 않을 경우
- 숫자가 들어오지 않았을 경우
- 페이지의 숫자가 범위를 벗어났을 경우

#### 2. 각 자리 숫자를 더하는 기능
#### 3. 각 자리 숫자를 곱하는 기능
#### 4. 가장 큰 수를 구하는 기능
#### 5. 승자를 구하는 기능

-----
## 문제 2

### input
- 임의의 문자열 cryptogram
- 알파벳 소문자로만 이루어짐
- 길이 1이상 1000이하

### output
- 중복된 문자들 삭제된 결과

### 구현 기능 목록
#### 1. input 예외 확인 기능
- 알파벳 소문자 외의 문자가 있을 경우
- 길이가 0이거나 1000초과일 경우

#### 2. 중복 문자 탐색
#### 3. 중복 문자 삭제
#### 4. 중복된 문자가 없을 때까지 2,3 기능 반복
#### 5. 결과 출력

-----
## 문제 3

### input
- 1 이상 10,000 이하 자연수

### output
- 1부터 number까지 3,6,9가 들어간 숫자의 3,6,9개수

### 구현 기능 목록
#### 1. input 예외 확인 기능
- 0이거나 10,001 이상일 경우

#### 2. 숫자에 들어가 있는 3,6,9 개수 세기
#### 3. number까지 반복

-----
## 문제 4

### input
- 길이 1이상 1000이하

### output
- 알파벳 외의 문자는 변환하지 않음
- 대문자는 대문자, 소문자는 소문자로
- 알파벳 순서에 따라 반대로 변환하여 출력

### 구현 기능 목록
#### 1. input 예외 확인 기능
- 0이거나 10,001 이상일 경우

#### 2. 문자 구분(소문자, 대문자, 그외)
#### 2. 소문자 변환
#### 3. 대문자 변환
#### 4. 알파벳 제외한 값 그대로 출력

-----
## 문제 5

### input
- 1이상 1000000이하 자연수

### output
- 출금한 총 돈의 개수가 최소가 되게 한다.
- 화폐의 종류는 오만 원권, 만 원권, 오천 원권, 천 원권, 오백원 동전, 백원 동전, 십원 동전, 일원 동전 (8종류)
- 금액이 큰 순으로 리스트/배열로 return

### 구현 기능 목록
#### 1. input 예외 확인 기능
- 0이거나 1,000,001이상일 경우

#### 2. 사용할 화폐 지정
#### 2. 사용한 화폐의 개수 세기
#### 3. 리스트에 저장