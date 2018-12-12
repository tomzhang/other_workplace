//
//  LGSocketServe.h
//  MELOVE
//
//  Created by superpomelo on 2017/7/6.
//  Copyright © 2017年 WUAI. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "AsyncSocket.h"


enum{
    SocketOfflineByServer,      //服务器掉线
    SocketOfflineByUser,        //用户断开
    SocketOfflineByWifiCut,     //wifi 断开
};


@interface LGSocketServe : NSObject<AsyncSocketDelegate>

@property (nonatomic, strong) AsyncSocket         *socket;       // socket
@property (nonatomic, retain) NSTimer             *heartTimer;   // 心跳计时器

+ (LGSocketServe *)sharedSocketServe;

//  socket连接
- (void)startConnectSocket;

// 断开socket连接
-(void)cutOffSocket;

// 发送消息
- (void)sendMessage:(id)message;



@end
