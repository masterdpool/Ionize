// Copyright (c) 2011-present, Facebook, Inc.  All rights reserved.
//  This source code is licensed under both the GPLv2 (found in the
//  COPYING file in the root directory) and Apache 2.0 License
//  (found in the LICENSE.Apache file in the root directory).

package org.rocksdb;

/**
 * Enum CompactionStyle
 *
 * RocksDB supports different styles of compaction. Available
 * compaction styles can be chosen using this enumeration.
 *
 * <ol>
 *   <li><strong>LEVEL</strong> - Level based Compaction style</li>
 *   <li><strong>UNIVERSAL</strong> - Universal Compaction Style is a
 *   compaction style, targeting the use cases requiring lower write
 *   amplification, trading off read amplification and space
 *   amplification.</li>
 *   <li><strong>FIFO</strong> - FIFO compaction style is the simplest
 *   compaction strategy. It is suited for keeping event log data with
 *   very low overhead (query log for example). It periodically deletes
 *   the old data, so it's basically a TTL compaction style.</li>
 * </ol>
 *
 * @see <a
 * href="https://github.com/facebook/rocksdb/wiki/Universal-Compaction">
 * Universal Compaction</a>
 * @see <a
 * href="https://github.com/facebook/rocksdb/wiki/FIFO-compaction-style">
 * FIFO Compaction</a>
 */
public enum CompactionStyle {
  LEVEL((byte) 0),
  UNIVERSAL((byte) 1),
  FIFO((byte) 2);

  private final byte value_;

  private CompactionStyle(byte value) {
    value_ = value;
  }

  /**
   * Returns the byte value of the enumerations value
   *
   * @return byte representation
   */
  public byte getValue() {
    return value_;
  }
}
