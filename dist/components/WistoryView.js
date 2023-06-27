"use strict";
var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    Object.defineProperty(o, k2, { enumerable: true, get: function() { return m[k]; } });
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.WistoryView = void 0;
var react_1 = __importStar(require("react"));
var react_native_1 = require("react-native");
var WistoryViewNativeComponent_1 = require("./WistoryViewNativeComponent");
var RNWistory = react_native_1.NativeModules.RNWistory;
var emitter = new react_native_1.NativeEventEmitter(RNWistory);
var styles = react_native_1.StyleSheet.create({
    wrapperStyle: {
        width: '100%',
        height: 98,
    },
    view: {
        flex: 1,
    },
});
function WistoryView(props) {
    var wrapperStyle = react_1.useMemo(function () { return [styles.wrapperStyle, props.wrapperStyle]; }, [props.wrapperStyle]);
    react_1.useEffect(function () {
        var subscription = emitter.addListener('onEvent', function (args) {
            var data = args;
            props.onEvent(data);
        });
        return function () { return subscription.remove(); };
    }, [props.onEvent]);
    return (react_1.default.createElement(react_native_1.View, { style: wrapperStyle },
        react_1.default.createElement(WistoryViewNativeComponent_1.WistoryViewNativeComponent, __assign({}, props, { style: styles.view }))));
}
exports.WistoryView = WistoryView;
//# sourceMappingURL=WistoryView.js.map