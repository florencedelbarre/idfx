.PHONY: all clean

SRC = $(shell find src/main/java -name "*.java")

TARGET_DIR = build/libs
TARGET = $(TARGET_DIR)/idfx-1.0-SNAPSHOT.jar

all: $(TARGET)

$(TARGET): $(SRC)
	gradle build
	touch $@

run:
	@java -jar $(TARGET)
