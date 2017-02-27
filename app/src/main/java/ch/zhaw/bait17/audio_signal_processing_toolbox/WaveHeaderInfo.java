package ch.zhaw.bait17.audio_signal_processing_toolbox;

/**
 * Header of WAV audio files.
 * Created by georgrem, stockan1 on 21.02.2017.
 */

public class WaveHeaderInfo implements HeaderInfo {

    private int encodingFormat = 0;
    private int channels = 0;
    private int sampleRate = 0;
    private int bitsPerSample = 0;
    private int bytesPerSample = 0;
    private int dataSize = 0;

    public WaveHeaderInfo(int encodingFormat, int channels, int sampleRate, int bitsPerSample,
                          int bytesPerSample, int dataSize) {
        this.encodingFormat = encodingFormat;
        this.channels = channels;
        this.sampleRate = sampleRate;
        this.bitsPerSample = bitsPerSample;
        this.bytesPerSample = bytesPerSample;
        this.dataSize = dataSize;
    }

    /**
     *
     * @return
     */
    @Override
    public int getEncodingFormat() {
        return encodingFormat;
    }

    /**
     * Returns true if audio data is encoded with linear pulse-code modulation.
     * @return
     */
    public boolean isLinearPCM() {
        return encodingFormat == AudioCodingFormat.LINEAR_PCM.getValue();
    }

    /**
     * Returns the number of channels.
     * @return
     */
    @Override
    public int getChannels() {
        return  channels;
    }

    /**
     * Returns the sample rate.
     * @return
     */
    @Override
    public int getSampleRate() {
        return sampleRate;
    }

    /**
     * Returns the number of bits per sample.
     * @return
     */
    @Override
    public int getBitsPerSample() {
        return bitsPerSample;
    }

    /**
     * Returns the number of bytes (for all channels) to represent one sample of data.
     * This is sometimes called the block alignment.
     * Definition: BitsPerSample * Channels / 8
     * @return
     */
    public int getBytesPerSample() {
        return bytesPerSample;
    }

    /**
     * Returns the PCM data size in bytes.
     * @return
     */
    @Override
    public int getDataSize() {
        return dataSize;
    }

    @Override
    public String toString() {
        return String.format("WAVE header:  encoding format=%s  channels=%d  sample rate=%d  bits per sample=%d",
                AudioCodingFormat.LINEAR_PCM.toString(), channels, sampleRate, bitsPerSample);
    }

}