install:
		./gradlew clean install

run-dist:
		./build/install/app/bin/app

check-update:
		./gradlew dependencyUpdates

lint:
		./gradlew checkstyleMain

build:
		./gradlew clean build

.PHONY: build
