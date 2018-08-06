package com.wavefront.sdk.reporter;

import com.wavefront.sdk.entities.events.WavefrontEventSender;
import com.wavefront.sdk.entities.histograms.WavefrontHistogramSender;
import com.wavefront.sdk.entities.metrics.WavefrontMetricSender;
import com.wavefront.sdk.entities.tracing.WavefrontTracingSpanSender;

/**
 * Wavefront reporter that reports entities/atoms to Wavefront
 *
 * @author Sushant Dewan (sushant@wavefront.com).
 */
public interface WavefrontReporter extends WavefrontMetricSender,
    WavefrontHistogramSender, WavefrontTracingSpanSender, WavefrontEventSender {
}
