package com.keyboardr.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.MaskFilter;
import android.graphics.Rasterizer;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RasterizerSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;

public class StyleableString extends SpannableString {

    public StyleableString(CharSequence source) {
        super(source);
    }

    public StyleableString setForegroundColor(int color) {
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(color);
        setSpan(colorSpan, 0, length(), 0);
        return this;
    }

    public StyleableString setBackgroundColor(int color) {
        BackgroundColorSpan colorSpan = new BackgroundColorSpan(color);
        setSpan(colorSpan, 0, length(), 0);
        return this;
    }

    public StyleableString setAbsoluteSizePx(int size) {
        AbsoluteSizeSpan span = new AbsoluteSizeSpan(size);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setAbsoluteSizeDp(int size) {
        AbsoluteSizeSpan span = new AbsoluteSizeSpan(size, true);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setRelativeSize(float size) {
        RelativeSizeSpan span = new RelativeSizeSpan(size);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setScaleX(float proportion) {
        ScaleXSpan span = new ScaleXSpan(proportion);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setUrl(String url) {
        URLSpan span = new URLSpan(url);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setOnClick(final Runnable runnable) {
        ClickableSpan span = new ClickableSpan() {

            @Override
            public void onClick(View widget) {
                runnable.run();
            }
        };
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setTypeFace(String family) {
        TypefaceSpan span = new TypefaceSpan(family);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setStyle(int style) {
        StyleSpan span = new StyleSpan(style);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setTextAppearance(Context context, int appearance) {
        TextAppearanceSpan span = new TextAppearanceSpan(context, appearance);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setTextAppearance(Context context, int appearance,
                                            int colorList) {
        TextAppearanceSpan span = new TextAppearanceSpan(context, appearance,
                colorList);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setTextAppearance(String family, int style, int size,
                                            ColorStateList color, ColorStateList link) {
        TextAppearanceSpan span = new TextAppearanceSpan(family, style, size,
                color, link);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setAlignment(Layout.Alignment align) {
        AlignmentSpan.Standard span = new AlignmentSpan.Standard(align);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setMaskFilter(MaskFilter filter) {
        MaskFilterSpan span = new MaskFilterSpan(filter);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString setRasterizer(Rasterizer r) {
        RasterizerSpan span = new RasterizerSpan(r);
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString makeStrikethrough() {
        StrikethroughSpan span = new StrikethroughSpan();
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString makeSubscript() {
        SubscriptSpan span = new SubscriptSpan();
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString makeSuperscript() {
        SuperscriptSpan span = new SuperscriptSpan();
        setSpan(span, 0, length(), 0);
        return this;
    }

    public StyleableString makeUnderline() {
        UnderlineSpan span = new UnderlineSpan();
        setSpan(span, 0, length(), 0);
        return this;
    }

}