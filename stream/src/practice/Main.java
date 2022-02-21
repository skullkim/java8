package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2021, 1000),
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700),
			new Transaction(alan, 2012, 950)
		);

		// 2011년에 일어난 모든 트랜잭션을 찾아 오름차순 정리
		List<Transaction> sortedTransactions = transactions.stream()
			.filter(transaction -> transaction.getYear() == 2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.collect(Collectors.toList());
		System.out.println("2011년에 일어난 모든 트랜잭션을 찾아 오름차순 정리");
		sortedTransactions.forEach(System.out::println);
		System.out.println();

		// 거래자가 근무하는 모든 도시를 중복없이 나열하라
		List<String> cities = transactions.stream()
			.map(transaction -> transaction.getTrader().getCity())
			.distinct()
			.collect(Collectors.toList());
		System.out.println("거래자가 근무하는 모든 도시를 중복없이 나열하라");
		cities.forEach(System.out::println);
		System.out.println();

		// 케임브리지에서 근무하느 모든 거래자를 찾아 이름순으로 정렬
		List<Trader> workingInCambridge = transactions.stream()
			.map(Transaction::getTrader)
			.filter(trader -> trader.getCity().equals("Cambridge"))
			.distinct()
			.sorted(Comparator.comparing(Trader::getName))
			.collect(Collectors.toList());
		System.out.println("케임브리지에서 근무하느 모든 거래자를 찾아 이름순으로 정렬");
		workingInCambridge.forEach(System.out::println);
		System.out.println();

		// 모든 거래자의 이름을 알파벳 순으로 정렬
		List<String> tradersName = transactions.stream()
			.map(transaction -> transaction.getTrader().getName())
			.distinct()
			.sorted()
			.collect(Collectors.toList());
		System.out.println("모든 거래자의 이름을 알파벳 순으로 정렬");
		tradersName.forEach(System.out::println);
		System.out.println();

		// 밀라노에 거래자가 있는가?
		boolean hasMilanTraders = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		System.out.println("밀라노에 거래자가 있는가?");
		System.out.println(hasMilanTraders);
		System.out.println();

		// 켐임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력
		List<Integer> cambridgeTransactionValues = transactions.stream()
			.filter(transaction -> transaction.getTrader().getCity().equals( "Cambridge"))
			.map(Transaction::getValue)
			.collect(Collectors.toList());
		System.out.println("켐임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력 ");
		cambridgeTransactionValues.forEach(System.out::println);
		System.out.println();

		// 전채 트랜잭션 중 최댓값
		Optional<Integer> maxTransactionValue = transactions.stream()
			.map(Transaction::getValue)
			.reduce(Integer::max);
		System.out.println("전채 트랜잭션 중 최댓값");
		System.out.println(maxTransactionValue.get());
		System.out.println();

		// 전체 트랜잭션 중 최솟값
		Optional<Integer> minTransactionValue = transactions.stream()
			.map(Transaction::getValue)
			.reduce(Integer::min);
		System.out.println("전체 트랜잭션 중 최솟값");
		System.out.println(minTransactionValue.get());
		System.out.println();

	}
}
