package com.jorge.apoorinstagram.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImageDAO_Impl implements ImageDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RoomImage> __insertionAdapterOfRoomImage;

  public ImageDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoomImage = new EntityInsertionAdapter<RoomImage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `images` (`id`,`title`,`url`,`likes`,`datetime`,`author`,`imageCount`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomImage value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        stmt.bindLong(4, value.getLikes());
        stmt.bindLong(5, value.getDatetime());
        if (value.getAuthor() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAuthor());
        }
        stmt.bindLong(7, value.getImageCount());
      }
    };
  }

  @Override
  public void insertImages(final List<RoomImage> imageList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRoomImage.insert(imageList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<RoomImage> getImages() {
    final String _sql = "SELECT * FROM images";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfLikes = CursorUtil.getColumnIndexOrThrow(_cursor, "likes");
      final int _cursorIndexOfDatetime = CursorUtil.getColumnIndexOrThrow(_cursor, "datetime");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfImageCount = CursorUtil.getColumnIndexOrThrow(_cursor, "imageCount");
      final List<RoomImage> _result = new ArrayList<RoomImage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RoomImage _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final int _tmpLikes;
        _tmpLikes = _cursor.getInt(_cursorIndexOfLikes);
        final long _tmpDatetime;
        _tmpDatetime = _cursor.getLong(_cursorIndexOfDatetime);
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final int _tmpImageCount;
        _tmpImageCount = _cursor.getInt(_cursorIndexOfImageCount);
        _item = new RoomImage(_tmpId,_tmpTitle,_tmpUrl,_tmpLikes,_tmpDatetime,_tmpAuthor,_tmpImageCount);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
