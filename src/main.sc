require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: start

    state: /hello
        q!: [* hello */* hi *
        a: sap
    
    state: /weather
        q!: * weather *
        a: sd
    
    state: /currency
        q!: * currency *
        a: dd
        
    state: /NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}