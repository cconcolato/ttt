/*
 * Copyright 2018 Skynav, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY SKYNAV, INC. AND ITS CONTRIBUTORS “AS IS” AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SKYNAV, INC. OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.skynav.ttv.model.ttml;

import java.net.URI;

import com.skynav.ttv.model.Profile.Usage;

import static com.skynav.ttv.model.ttml.TTML2.Constants.*;

public class TTML2TransformationProfileSpecification extends TTML1TransformationProfileSpecification {

    private static final Object[][] featureMapEntries = new Object[][] {
        { "#animate", Usage.OPTIONAL },
        { "#animate-fill", Usage.OPTIONAL },
        { "#animate-minimal", Usage.OPTIONAL },
        { "#animate-paced", Usage.OPTIONAL },
        { "#animate-spline", Usage.OPTIONAL },
        { "#animate-repeat", Usage.OPTIONAL },
        { "#animation", Usage.OPTIONAL },
        { "#animation-out-of-line", Usage.OPTIONAL },
        { "#animation-version-2", Usage.OPTIONAL },
        { "#audio", Usage.OPTIONAL },
        { "#audio-description", Usage.OPTIONAL },
        { "#audio-speech", Usage.OPTIONAL },
        { "#background", Usage.OPTIONAL },
        { "#background-image", Usage.OPTIONAL },
        { "#backgroundClip", Usage.OPTIONAL },
        { "#backgroundColor-block", Usage.OPTIONAL },
        { "#backgroundColor-inline", Usage.OPTIONAL },
        { "#backgroundColor-region", Usage.OPTIONAL },
        { "#backgroundColor", Usage.OPTIONAL },
        { "#backgroundExtent", Usage.OPTIONAL },
        { "#backgroundImage", Usage.OPTIONAL },
        { "#backgroundOrigin", Usage.OPTIONAL },
        { "#backgroundPosition", Usage.OPTIONAL },
        { "#backgroundRepeat", Usage.OPTIONAL },
        { "#base", Usage.OPTIONAL },
        { "#base-general", Usage.OPTIONAL },
        { "#base-version-2", Usage.OPTIONAL },
        { "#bidi", Usage.OPTIONAL },
        { "#bidi-version-2", Usage.OPTIONAL },
        { "#border", Usage.OPTIONAL },
        { "#border-block", Usage.OPTIONAL },
        { "#border-inline", Usage.OPTIONAL },
        { "#border-radii", Usage.OPTIONAL },
        { "#border-radii-1", Usage.OPTIONAL },
        { "#border-radii-2", Usage.OPTIONAL },
        { "#border-region", Usage.OPTIONAL },
        { "#bpd", Usage.OPTIONAL },
        { "#cellResolution", Usage.OPTIONAL },
        { "#chunk", Usage.OPTIONAL },
        { "#clockMode", Usage.OPTIONAL },
        { "#clockMode-gps", Usage.OPTIONAL },
        { "#clockMode-local", Usage.OPTIONAL },
        { "#clockMode-utc", Usage.OPTIONAL },
        { "#color", Usage.OPTIONAL },
        { "#condition", Usage.OPTIONAL },
        { "#condition-fn-media", Usage.OPTIONAL },
        { "#condition-fn-parameter", Usage.OPTIONAL },
        { "#condition-fn-supports", Usage.OPTIONAL },
        { "#condition-primary", Usage.OPTIONAL },
        { "#content", Usage.REQUIRED },
        { "#content-sizing", Usage.OPTIONAL },
        { "#contentProfiles", Usage.REQUIRED },
        { "#contentProfiles-combined", Usage.OPTIONAL },
        { "#core", Usage.REQUIRED },
        { "#data", Usage.OPTIONAL },
        { "#direction", Usage.OPTIONAL },
        { "#disparity", Usage.OPTIONAL },
        { "#display", Usage.OPTIONAL },
        { "#display-block", Usage.OPTIONAL },
        { "#display-inline", Usage.OPTIONAL },
        { "#display-inlineBlock", Usage.OPTIONAL },
        { "#display-region", Usage.OPTIONAL },
        { "#display-version-2", Usage.OPTIONAL },
        { "#displayAlign", Usage.OPTIONAL },
        { "#displayAlign-block", Usage.OPTIONAL },
        { "#displayAlign-justify", Usage.OPTIONAL },
        { "#displayAlign-region", Usage.OPTIONAL },
        { "#displayAlign-relative", Usage.OPTIONAL },
        { "#displayAlign-version-2", Usage.OPTIONAL },
        { "#displayAspectRatio", Usage.OPTIONAL },
        { "#dropMode", Usage.OPTIONAL },
        { "#dropMode-dropNTSC", Usage.OPTIONAL },
        { "#dropMode-dropPAL", Usage.OPTIONAL },
        { "#dropMode-nonDrop", Usage.OPTIONAL },
        { "#embedded-audio", Usage.OPTIONAL },
        { "#embedded-content", Usage.OPTIONAL },
        { "#embedded-data", Usage.OPTIONAL },
        { "#embedded-font", Usage.OPTIONAL },
        { "#embedded-image", Usage.OPTIONAL },
        { "#extent", Usage.OPTIONAL },
        { "#extent-auto", Usage.OPTIONAL },
        { "#extent-auto-version-2", Usage.OPTIONAL },
        { "#extent-contain", Usage.OPTIONAL },
        { "#extent-cover", Usage.OPTIONAL },
        { "#extent-full-version-2", Usage.OPTIONAL },
        { "#extent-image", Usage.OPTIONAL },
        { "#extent-length", Usage.OPTIONAL },
        { "#extent-length-version-2", Usage.OPTIONAL },
        { "#extent-measure", Usage.OPTIONAL },
        { "#extent-region", Usage.OPTIONAL },
        { "#extent-region-version-2", Usage.OPTIONAL },
        { "#extent-root", Usage.OPTIONAL },
        { "#extent-root-version-2", Usage.OPTIONAL },
        { "#extent-version-2", Usage.OPTIONAL },
        { "#font", Usage.OPTIONAL },
        { "#fontFamily", Usage.OPTIONAL },
        { "#fontFamily-generic", Usage.OPTIONAL },
        { "#fontFamily-non-generic", Usage.OPTIONAL },
        { "#fontKerning", Usage.OPTIONAL },
        { "#fontSelectionStrategy", Usage.OPTIONAL },
        { "#fontSelectionStrategy-character", Usage.OPTIONAL },
        { "#fontShear", Usage.OPTIONAL },
        { "#fontSize", Usage.OPTIONAL },
        { "#fontSize-anamorphic", Usage.OPTIONAL },
        { "#fontSize-isomorphic", Usage.OPTIONAL },
        { "#fontStyle", Usage.OPTIONAL },
        { "#fontStyle-italic", Usage.OPTIONAL },
        { "#fontStyle-oblique", Usage.OPTIONAL },
        { "#fontVariant", Usage.OPTIONAL },
        { "#fontWeight", Usage.OPTIONAL },
        { "#fontWeight-bold", Usage.OPTIONAL },
        { "#frameRate", Usage.OPTIONAL },
        { "#frameRateMultiplier", Usage.OPTIONAL },
        { "#gain", Usage.OPTIONAL },
        { "#image", Usage.OPTIONAL },
        { "#image-png", Usage.OPTIONAL },
        { "#initial", Usage.OPTIONAL },
        { "#ipd", Usage.OPTIONAL },
        { "#layout", Usage.OPTIONAL },
        { "#length", Usage.OPTIONAL },
        { "#length-cell", Usage.OPTIONAL },
        { "#length-em", Usage.OPTIONAL },
        { "#length-integer", Usage.OPTIONAL },
        { "#length-negative", Usage.OPTIONAL },
        { "#length-percentage", Usage.OPTIONAL },
        { "#length-pixel", Usage.OPTIONAL },
        { "#length-positive", Usage.OPTIONAL },
        { "#length-real", Usage.OPTIONAL },
        { "#length-root-container-relative", Usage.OPTIONAL },
        { "#length-version-2", Usage.OPTIONAL },
        { "#letterSpacing", Usage.OPTIONAL },
        { "#lineBreak-uax14", Usage.OPTIONAL },
        { "#lineHeight", Usage.OPTIONAL },
        { "#lineShear", Usage.OPTIONAL },
        { "#luminance", Usage.OPTIONAL },
        { "#markerMode", Usage.OPTIONAL },
        { "#markerMode-continuous", Usage.OPTIONAL },
        { "#markerMode-discontinuous", Usage.OPTIONAL },
        { "#metadata", Usage.OPTIONAL },
        { "#metadata-item", Usage.OPTIONAL },
        { "#metadata-version-2", Usage.OPTIONAL },
        { "#nested-div", Usage.OPTIONAL },
        { "#nested-span", Usage.OPTIONAL },
        { "#opacity", Usage.OPTIONAL },
        { "#opacity-block", Usage.OPTIONAL },
        { "#opacity-inline", Usage.OPTIONAL },
        { "#opacity-region", Usage.OPTIONAL },
        { "#opacity-version-2", Usage.OPTIONAL },
        { "#origin", Usage.OPTIONAL },
        { "#overflow", Usage.OPTIONAL },
        { "#overflow-visible", Usage.OPTIONAL },
        { "#padding", Usage.OPTIONAL },
        { "#padding-1", Usage.OPTIONAL },
        { "#padding-2", Usage.OPTIONAL },
        { "#padding-3", Usage.OPTIONAL },
        { "#padding-4", Usage.OPTIONAL },
        { "#padding-block", Usage.OPTIONAL },
        { "#padding-inline", Usage.OPTIONAL },
        { "#padding-region", Usage.OPTIONAL },
        { "#padding-version-2", Usage.OPTIONAL },
        { "#pan", Usage.OPTIONAL },
        { "#permitFeatureNarrowing", Usage.OPTIONAL },
        { "#permitFeatureWidening", Usage.OPTIONAL },
        { "#pitch", Usage.OPTIONAL },
        { "#pixelAspectRatio", Usage.OPTIONAL },
        { "#position", Usage.OPTIONAL },
        { "#presentation", Usage.OPTIONAL },
        { "#presentation-version-2", Usage.OPTIONAL },
        { "#processorProfiles", Usage.REQUIRED },
        { "#processorProfiles-combined", Usage.OPTIONAL },
        { "#profile", Usage.REQUIRED },
        { "#profile-full-version-2", Usage.OPTIONAL },
        { "#profile-nesting", Usage.OPTIONAL },
        { "#profile-version-2", Usage.REQUIRED },
        { "#region-implied-animation", Usage.OPTIONAL },
        { "#region-inline", Usage.OPTIONAL },
        { "#region-timing", Usage.OPTIONAL },
        { "#resources", Usage.OPTIONAL },
        { "#ruby", Usage.OPTIONAL },
        { "#ruby-full", Usage.OPTIONAL },
        { "#rubyAlign", Usage.OPTIONAL },
        { "#rubyAlign-minimal", Usage.OPTIONAL },
        { "#rubyAlign-withBase", Usage.OPTIONAL },
        { "#rubyPosition", Usage.OPTIONAL },
        { "#rubyReserve", Usage.OPTIONAL },
        { "#set", Usage.OPTIONAL },
        { "#set-fill", Usage.OPTIONAL },
        { "#set-multiple-styles", Usage.OPTIONAL },
        { "#set-repeat", Usage.OPTIONAL },
        { "#shear", Usage.OPTIONAL },
        { "#showBackground", Usage.OPTIONAL },
        { "#source", Usage.OPTIONAL },
        { "#speak", Usage.OPTIONAL },
        { "#speech", Usage.OPTIONAL },
        { "#structure", Usage.REQUIRED },
        { "#styling", Usage.OPTIONAL },
        { "#styling-chained", Usage.OPTIONAL },
        { "#styling-inheritance-content", Usage.OPTIONAL },
        { "#styling-inheritance-region", Usage.OPTIONAL },
        { "#styling-inline", Usage.OPTIONAL },
        { "#styling-nested", Usage.OPTIONAL },
        { "#styling-referential", Usage.OPTIONAL },
        { "#subFrameRate", Usage.OPTIONAL },
        { "#textAlign", Usage.OPTIONAL },
        { "#textAlign-absolute", Usage.OPTIONAL },
        { "#textAlign-justify", Usage.OPTIONAL },
        { "#textAlign-relative", Usage.OPTIONAL },
        { "#textAlign-version-2", Usage.OPTIONAL },
        { "#textCombine", Usage.OPTIONAL },
        { "#textDecoration", Usage.OPTIONAL },
        { "#textDecoration-over", Usage.OPTIONAL },
        { "#textDecoration-through", Usage.OPTIONAL },
        { "#textDecoration-under", Usage.OPTIONAL },
        { "#textEmphasis", Usage.OPTIONAL },
        { "#textEmphasis-color", Usage.OPTIONAL },
        { "#textEmphasis-minimal", Usage.OPTIONAL },
        { "#textEmphasis-quoted-string", Usage.OPTIONAL },
        { "#textOrientation", Usage.OPTIONAL },
        { "#textOrientation-sideways-LR", Usage.OPTIONAL },
        { "#textOutline", Usage.OPTIONAL },
        { "#textOutline-blurred", Usage.OPTIONAL },
        { "#textOutline-unblurred", Usage.OPTIONAL },
        { "#textShadow", Usage.OPTIONAL },
        { "#tickRate", Usage.OPTIONAL },
        { "#time-clock-with-frames", Usage.OPTIONAL },
        { "#time-clock", Usage.OPTIONAL },
        { "#time-offset-with-frames", Usage.OPTIONAL },
        { "#time-offset-with-ticks", Usage.OPTIONAL },
        { "#time-offset", Usage.REQUIRED },
        { "#time-wall-clock", Usage.OPTIONAL },
        { "#timeBase-clock", Usage.OPTIONAL },
        { "#timeBase-media", Usage.OPTIONAL },
        { "#timeBase-smpte", Usage.OPTIONAL },
        { "#timeContainer", Usage.OPTIONAL },
        { "#timing", Usage.REQUIRED },
        { "#transformation", Usage.REQUIRED },
        { "#transformation-version-2", Usage.REQUIRED },
        { "#unicodeBidi", Usage.OPTIONAL },
        { "#unicodeBidi-isolate", Usage.OPTIONAL },
        { "#unicodeBidi-version-2", Usage.OPTIONAL },
        { "#validation", Usage.OPTIONAL },
        { "#visibility", Usage.OPTIONAL },
        { "#visibility-block", Usage.OPTIONAL },
        { "#visibility-image", Usage.OPTIONAL },
        { "#visibility-inline", Usage.OPTIONAL },
        { "#visibility-region", Usage.OPTIONAL },
        { "#visibility-version-2", Usage.OPTIONAL },
        { "#wrapOption", Usage.OPTIONAL },
        { "#writingMode", Usage.OPTIONAL },
        { "#writingMode-horizontal-lr", Usage.OPTIONAL },
        { "#writingMode-horizontal-rl", Usage.OPTIONAL },
        { "#writingMode-horizontal", Usage.OPTIONAL },
        { "#writingMode-vertical", Usage.OPTIONAL },
        { "#xlink", Usage.OPTIONAL },
        { "#zIndex", Usage.OPTIONAL }
    };

    private static final Object[][] extensionMapEntries = new Object[][] {
    };

    public TTML2TransformationProfileSpecification(URI profileUri) {
        super(profileUri, null, featuresMap(NAMESPACE_TT_FEATURE, featureMapEntries), extensionsMap(NAMESPACE_TT_EXTENSION, extensionMapEntries));
    }

}
