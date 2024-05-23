package com.startupcode.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
    public static void main(String[] args) {
        // 데이터 소스: 이름 리스트 생성
        List<String> names = Arrays.asList("김철수", "James", "박민수", "최지우", "한예슬");

        // 스트림 파이프라인: 필터링 및 변환 작업
        List<String> result = names.stream()                   // 스트림 생성
                .filter(name -> name.startsWith("J")) // 중간 연산: 'J'로 시작하는 이름 필터링
                .map(String::toUpperCase)             // 중간 연산: 이름을 대문자로 변환
                .sorted()                             // 중간 연산: 정렬
                .toList();        // 최종 연산: 결과를 리스트로 수집
        // 최종 연산: 결과를 리스트로 수집

        // 결과 출력
        result.forEach(System.out::println); // 출력: JAMES

    }
}

