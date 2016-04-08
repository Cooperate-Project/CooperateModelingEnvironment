#!/bin/bash
set -e

if [[ "$TRAVIS_BRANCH" = "master" && "$TRAVIS_PULL_REQUEST" = "false" ]]; then
	echo mvn $1 clean deploy sonar:sonar
	mvn $1 clean deploy sonar:sonar
elif [[ "$TRAVIS_PULL_REQUEST" = "false" ]]; then
	echo mvn $1 -Dsonar.branch="$TRAVIS_BRANCH" clean verify sonar:sonar
	mvn mvn $1 -Dsonar.branch="$TRAVIS_BRANCH" clean verify sonar:sonar
else
	echo mvn $1 clean verify
	mvn $1 clean verify
fi


