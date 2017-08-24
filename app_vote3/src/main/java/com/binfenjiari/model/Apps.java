/*
 * Copyright (C) 2017 Huajian Jiang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.binfenjiari.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Huajian Jiang on 2017/8/24.
 * developer.huajianjiang@gmail.com
 */
public class Apps {

    public static List<Img> getImgs(String pathStr) {
        String[] urls = pathStr.split(",");
        List<Img> imgs = new ArrayList<>();
        for (String url : urls) {
            Img img = new Img();
            img.url = url;
            imgs.add(img);
        }
        return imgs;
    }
}