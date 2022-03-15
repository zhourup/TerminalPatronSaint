function goTest() {
    console.log("引用成功")
};

function getMap() {
    var map = new BMap.Map("map");
    map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
    map.addControl(
        new BMap.MapTypeControl({
            mapTypes: [BMAP_NORMAL_MAP, BMAP_HYBRID_MAP],
        })
    );
    var mapStyle = {
        style: "dark",
    };
    map.setMapStyle(mapStyle);
    map.setCurrentCity("北京");
    map.enableScrollWheelZoom(true);
};

export {
    goTest,
    getMap
}