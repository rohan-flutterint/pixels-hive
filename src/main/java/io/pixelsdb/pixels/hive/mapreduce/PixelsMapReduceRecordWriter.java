/*
 * Copyright 2019 PixelsDB.
 *
 * This file is part of Pixels.
 *
 * Pixels is free software: you can redistribute it and/or modify
 * it under the terms of the Affero GNU General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Pixels is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Affero GNU General Public License for more details.
 *
 * You should have received a copy of the Affero GNU General Public
 * License along with Pixels.  If not, see
 * <https://www.gnu.org/licenses/>.
 */
package io.pixelsdb.pixels.hive.mapreduce;

import io.pixelsdb.pixels.hive.PixelsSerDe.PixelsRow;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

import java.io.IOException;

/**
 * This class is not finished, so that write is not supported by pixels-hive.
 * Created at: 19-6-30
 * Author: hank
 */
public class PixelsMapReduceRecordWriter extends RecordWriter<NullWritable, PixelsRow>
{
    /**
     * Writes a key/value pair.
     *
     * @param key   the key to write.
     * @param value the value to write.
     * @throws IOException
     */
    @Override
    public void write(NullWritable key, PixelsRow value) throws IOException, InterruptedException
    {

    }

    /**
     * Close this <code>RecordWriter</code> to future operations.
     *
     * @param context the context of the task
     * @throws IOException
     */
    @Override
    public void close(TaskAttemptContext context) throws IOException, InterruptedException
    {

    }
}
