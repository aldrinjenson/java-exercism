class RnaTranscription {
    String transcribe(String dnaStrand) {
        if (dnaStrand.isEmpty())
            return "";
        String transcription = "";
        for (char c : dnaStrand.toCharArray()) {
            if (c == 'C')
                transcription += 'G';
            else if (c == 'G')
                transcription += 'C';
            else if (c == 'T')
                transcription += 'A';
            else if (c == 'A')
                transcription += 'U';
        }
        return transcription;
    }

}
