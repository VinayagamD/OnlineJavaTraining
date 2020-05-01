package com.vinay.filereaderutils;

import com.vinay.filereaderutils.parsers.FileParsers;

public class FileReaderUtils {

    public enum FileSeparator {
        CSV(",");

        private final String separators;

        FileSeparator(String separators) {
            this.separators = separators;
        }

        public String getSeparators() {
            return separators;
        }
    }

    private FileParsers fileParsers;


}
