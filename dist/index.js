"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    Object.defineProperty(o, k2, { enumerable: true, get: function() { return m[k]; } });
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __exportStar = (this && this.__exportStar) || function(m, exports) {
    for (var p in m) if (p !== "default" && !exports.hasOwnProperty(p)) __createBinding(exports, m, p);
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.Wistory = void 0;
var react_native_1 = require("react-native");
__exportStar(require("./components/WistoryView"), exports);
var NativeWistoryModule = react_native_1.NativeModules.RNWistory;
var Wistory = /** @class */ (function () {
    function Wistory() {
    }
    Wistory.init = function (companyToken, userToken, apiUrl, favoriteString) {
        NativeWistoryModule.init(companyToken, userToken, apiUrl, favoriteString);
    };
    return Wistory;
}());
exports.Wistory = Wistory;
//# sourceMappingURL=index.js.map