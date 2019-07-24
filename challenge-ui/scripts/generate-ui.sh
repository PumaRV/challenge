#!/bin/sh

echo "Building UI"

rm -rf dist/

ng build --prod

echo "UI generated"
